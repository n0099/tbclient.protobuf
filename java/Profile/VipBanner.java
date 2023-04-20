package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VipBanner extends Message {
    public static final String DEFAULT_BUBBLE = "";
    public static final String DEFAULT_BUTTON_LABLE = "";
    public static final String DEFAULT_BUTTON_URL = "";
    public static final String DEFAULT_SUB_LABLE = "";
    public static final String DEFAULT_SUB_TITLE = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bubble;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String button_lable;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_url;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String sub_lable;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VipBanner> {
        public String bubble;
        public String button_lable;
        public String button_url;
        public String sub_lable;
        public String sub_title;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(VipBanner vipBanner) {
            super(vipBanner);
            if (vipBanner == null) {
                return;
            }
            this.title = vipBanner.title;
            this.sub_title = vipBanner.sub_title;
            this.button_lable = vipBanner.button_lable;
            this.bubble = vipBanner.bubble;
            this.url = vipBanner.url;
            this.button_url = vipBanner.button_url;
            this.sub_lable = vipBanner.sub_lable;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VipBanner build(boolean z) {
            return new VipBanner(this, z);
        }
    }

    public VipBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.sub_title;
            if (str2 == null) {
                this.sub_title = "";
            } else {
                this.sub_title = str2;
            }
            String str3 = builder.button_lable;
            if (str3 == null) {
                this.button_lable = "";
            } else {
                this.button_lable = str3;
            }
            String str4 = builder.bubble;
            if (str4 == null) {
                this.bubble = "";
            } else {
                this.bubble = str4;
            }
            String str5 = builder.url;
            if (str5 == null) {
                this.url = "";
            } else {
                this.url = str5;
            }
            String str6 = builder.button_url;
            if (str6 == null) {
                this.button_url = "";
            } else {
                this.button_url = str6;
            }
            String str7 = builder.sub_lable;
            if (str7 == null) {
                this.sub_lable = "";
                return;
            } else {
                this.sub_lable = str7;
                return;
            }
        }
        this.title = builder.title;
        this.sub_title = builder.sub_title;
        this.button_lable = builder.button_lable;
        this.bubble = builder.bubble;
        this.url = builder.url;
        this.button_url = builder.button_url;
        this.sub_lable = builder.sub_lable;
    }
}
