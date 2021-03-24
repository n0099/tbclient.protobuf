package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class UrlMap extends Message {
    public static final Integer DEFAULT_ID = 0;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<UrlMap> {
        public Integer id;
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(UrlMap urlMap) {
            super(urlMap);
            if (urlMap == null) {
                return;
            }
            this.id = urlMap.id;
            this.name = urlMap.name;
            this.url = urlMap.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UrlMap build(boolean z) {
            return new UrlMap(this, z);
        }
    }

    public UrlMap(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.url = builder.url;
    }
}
