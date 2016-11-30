package com.alicp.jetcache.embedded;

/**
 * Created on 2016/11/29.
 *
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
public class CaffeineCacheBuilder extends EmbeddedCacheBuilder {
    public static class CaffeineCacheBuilderImpl extends EmbeddedCacheBuilder<CaffeineCacheBuilderImpl> {
    }

    public static CaffeineCacheBuilder createCaffeineCacheBuilder() {
        return new CaffeineCacheBuilder();
    }

    public CaffeineCacheBuilder() {
        buildFunc((c) -> new CaffeineCache((EmbeddedCacheConfig) c));
    }
}