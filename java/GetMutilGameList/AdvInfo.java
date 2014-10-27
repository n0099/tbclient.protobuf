package tbclient.GetMutilGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class AdvInfo extends Message {
    public static final String DEFAULT_AD_LINK_ANDROID = "";
    public static final String DEFAULT_AD_LINK_IOS = "";
    public static final String DEFAULT_AD_LINK_WEBVIEW = "";
    public static final String DEFAULT_AD_PIC = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_GAME_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_link_android;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ad_link_ios;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ad_link_webview;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ad_pic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_name;

    /* synthetic */ AdvInfo(Builder builder, boolean z, AdvInfo advInfo) {
        this(builder, z);
    }

    private AdvInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.game_name == null) {
                this.game_name = "";
            } else {
                this.game_name = builder.game_name;
            }
            if (builder.game_id == null) {
                this.game_id = "";
            } else {
                this.game_id = builder.game_id;
            }
            if (builder.ad_link_android == null) {
                this.ad_link_android = "";
            } else {
                this.ad_link_android = builder.ad_link_android;
            }
            if (builder.ad_link_webview == null) {
                this.ad_link_webview = "";
            } else {
                this.ad_link_webview = builder.ad_link_webview;
            }
            if (builder.ad_link_ios == null) {
                this.ad_link_ios = "";
            } else {
                this.ad_link_ios = builder.ad_link_ios;
            }
            if (builder.ad_pic == null) {
                this.ad_pic = "";
                return;
            } else {
                this.ad_pic = builder.ad_pic;
                return;
            }
        }
        this.game_name = builder.game_name;
        this.game_id = builder.game_id;
        this.ad_link_android = builder.ad_link_android;
        this.ad_link_webview = builder.ad_link_webview;
        this.ad_link_ios = builder.ad_link_ios;
        this.ad_pic = builder.ad_pic;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<AdvInfo> {
        public String ad_link_android;
        public String ad_link_ios;
        public String ad_link_webview;
        public String ad_pic;
        public String game_id;
        public String game_name;

        public Builder(AdvInfo advInfo) {
            super(advInfo);
            if (advInfo != null) {
                this.game_name = advInfo.game_name;
                this.game_id = advInfo.game_id;
                this.ad_link_android = advInfo.ad_link_android;
                this.ad_link_webview = advInfo.ad_link_webview;
                this.ad_link_ios = advInfo.ad_link_ios;
                this.ad_pic = advInfo.ad_pic;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdvInfo build(boolean z) {
            return new AdvInfo(this, z, null);
        }
    }
}
