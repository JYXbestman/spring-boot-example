package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value={"com.example.mapper"})
public class MybatisPlusSaasConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        // 先 add TenantLineInnerInterceptor 再 add PaginationInnerInterceptor
//        interceptor.addInnerInterceptor(new TenantLineInnerInterceptor(new TenantLineHandler() {
//            @Override
//            public Expression getTenantId() {
//                String tenant_id = oConvertUtils.getString(TenantContext.getTenant(),"0");
//                return new LongValue(tenant_id);
//            }
//
//            @Override
//            public String getTenantIdColumn(){
//                return TENANT_FIELD_NAME;
//            }
//
//            // 返回 true 表示不走租户逻辑
//            @Override
//            public boolean ignoreTable(String tableName) {
////                for(String temp: tenantTable){
////                    if(temp.equalsIgnoreCase(tableName)){
////                        return true;
////                    }
////                }
//                return true;
//            }
//        }));
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
