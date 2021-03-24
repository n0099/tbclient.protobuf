package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class FineBannerPb extends Message {
    public static final Long DEFAULT_FTID = 0L;
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long ftid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<FineBannerPb> {
        public Long ftid;
        public String link_url;
        public String pic_url;
        public String title;

        public Builder() {
        }

        public Builder(FineBannerPb fineBannerPb) {
            super(fineBannerPb);
            if (fineBannerPb == null) {
                return;
            }
            this.ftid = fineBannerPb.ftid;
            this.title = fineBannerPb.title;
            this.pic_url = fineBannerPb.pic_url;
            this.link_url = fineBannerPb.link_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FineBannerPb build(boolean z) {
            return new FineBannerPb(this, z);
        }
    }

    public FineBannerPb(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.ftid;
            if (l == null) {
                this.ftid = DEFAULT_FTID;
            } else {
                this.ftid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.pic_url;
            if (str2 == null) {
                this.pic_url = "";
            } else {
                this.pic_url = str2;
            }
            String str3 = builder.link_url;
            if (str3 == null) {
                this.link_url = "";
                return;
            } else {
                this.link_url = str3;
                return;
            }
        }
        this.ftid = builder.ftid;
        this.title = builder.title;
        this.pic_url = builder.pic_url;
        this.link_url = builder.link_url;
    }
}
