package tbclient.GetGameAdvertise;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
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

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
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
                this.ad_pic = DEFAULT_AD_PIC;
                return;
            } else {
                this.ad_pic = immutableCopyOf(builder.ad_pic);
                return;
            }
        }
        this.ad_link_android = builder.ad_link_android;
        this.ad_link_webview = builder.ad_link_webview;
        this.ad_link_ios = builder.ad_link_ios;
        this.ad_pic = immutableCopyOf(builder.ad_pic);
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public String ad_link_android;
        public String ad_link_ios;
        public String ad_link_webview;
        public List<String> ad_pic;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.ad_link_android = dataRes.ad_link_android;
                this.ad_link_webview = dataRes.ad_link_webview;
                this.ad_link_ios = dataRes.ad_link_ios;
                this.ad_pic = DataRes.copyOf(dataRes.ad_pic);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
