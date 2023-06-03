package tbclient.GameIndex;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class AdList extends Message {
    public static final String DEFAULT_AD_LINK_ANDROID = "";
    public static final String DEFAULT_AD_LINK_IOS = "";
    public static final String DEFAULT_AD_LINK_WEBVIEW = "";
    public static final List<String> DEFAULT_AD_PIC = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String ad_link_android;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_link_ios;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ad_link_webview;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> ad_pic;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AdList> {
        public String ad_link_android;
        public String ad_link_ios;
        public String ad_link_webview;
        public List<String> ad_pic;

        public Builder() {
        }

        public Builder(AdList adList) {
            super(adList);
            if (adList == null) {
                return;
            }
            this.ad_link_android = adList.ad_link_android;
            this.ad_link_webview = adList.ad_link_webview;
            this.ad_link_ios = adList.ad_link_ios;
            this.ad_pic = Message.copyOf(adList.ad_pic);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdList build(boolean z) {
            return new AdList(this, z);
        }
    }

    public AdList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.ad_link_android;
            if (str == null) {
                this.ad_link_android = "";
            } else {
                this.ad_link_android = str;
            }
            String str2 = builder.ad_link_webview;
            if (str2 == null) {
                this.ad_link_webview = "";
            } else {
                this.ad_link_webview = str2;
            }
            String str3 = builder.ad_link_ios;
            if (str3 == null) {
                this.ad_link_ios = "";
            } else {
                this.ad_link_ios = str3;
            }
            List<String> list = builder.ad_pic;
            if (list == null) {
                this.ad_pic = DEFAULT_AD_PIC;
                return;
            } else {
                this.ad_pic = Message.immutableCopyOf(list);
                return;
            }
        }
        this.ad_link_android = builder.ad_link_android;
        this.ad_link_webview = builder.ad_link_webview;
        this.ad_link_ios = builder.ad_link_ios;
        this.ad_pic = Message.immutableCopyOf(builder.ad_pic);
    }
}
