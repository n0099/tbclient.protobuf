package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class Banner extends Message {
    public static final String DEFAULT_BANNER_URL = "";
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_VALUE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer banner_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String banner_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer template_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String value;
    public static final Integer DEFAULT_BANNER_TYPE = 0;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_TEMPLATE_ID = 0;

    /* synthetic */ Banner(Builder builder, boolean z, Banner banner) {
        this(builder, z);
    }

    private Banner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.banner_url == null) {
                this.banner_url = "";
            } else {
                this.banner_url = builder.banner_url;
            }
            if (builder.banner_type == null) {
                this.banner_type = DEFAULT_BANNER_TYPE;
            } else {
                this.banner_type = builder.banner_type;
            }
            if (builder.value == null) {
                this.value = "";
            } else {
                this.value = builder.value;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.desc == null) {
                this.desc = "";
            } else {
                this.desc = builder.desc;
            }
            if (builder.template_id == null) {
                this.template_id = DEFAULT_TEMPLATE_ID;
                return;
            } else {
                this.template_id = builder.template_id;
                return;
            }
        }
        this.banner_url = builder.banner_url;
        this.banner_type = builder.banner_type;
        this.value = builder.value;
        this.type = builder.type;
        this.desc = builder.desc;
        this.template_id = builder.template_id;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<Banner> {
        public Integer banner_type;
        public String banner_url;
        public String desc;
        public Integer template_id;
        public Integer type;
        public String value;

        public Builder() {
        }

        public Builder(Banner banner) {
            super(banner);
            if (banner != null) {
                this.banner_url = banner.banner_url;
                this.banner_type = banner.banner_type;
                this.value = banner.value;
                this.type = banner.type;
                this.desc = banner.desc;
                this.template_id = banner.template_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Banner build(boolean z) {
            return new Banner(this, z, null);
        }
    }
}
