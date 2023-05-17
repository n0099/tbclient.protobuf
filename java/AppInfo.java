package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class AppInfo extends Message {
    public static final String DEFAULT_AD_APK_PACKAGE_NAME = "";
    public static final String DEFAULT_AD_NAME = "";
    public static final String DEFAULT_APK_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ad_apk_package_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer ad_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ad_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String apk_url;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long app_size;
    public static final Integer DEFAULT_AD_ID = 0;
    public static final Long DEFAULT_APP_SIZE = 0L;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AppInfo> {
        public String ad_apk_package_name;
        public Integer ad_id;
        public String ad_name;
        public String apk_url;
        public Long app_size;

        public Builder() {
        }

        public Builder(AppInfo appInfo) {
            super(appInfo);
            if (appInfo == null) {
                return;
            }
            this.ad_id = appInfo.ad_id;
            this.ad_name = appInfo.ad_name;
            this.apk_url = appInfo.apk_url;
            this.ad_apk_package_name = appInfo.ad_apk_package_name;
            this.app_size = appInfo.app_size;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AppInfo build(boolean z) {
            return new AppInfo(this, z);
        }
    }

    public AppInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.ad_id;
            if (num == null) {
                this.ad_id = DEFAULT_AD_ID;
            } else {
                this.ad_id = num;
            }
            String str = builder.ad_name;
            if (str == null) {
                this.ad_name = "";
            } else {
                this.ad_name = str;
            }
            String str2 = builder.apk_url;
            if (str2 == null) {
                this.apk_url = "";
            } else {
                this.apk_url = str2;
            }
            String str3 = builder.ad_apk_package_name;
            if (str3 == null) {
                this.ad_apk_package_name = "";
            } else {
                this.ad_apk_package_name = str3;
            }
            Long l = builder.app_size;
            if (l == null) {
                this.app_size = DEFAULT_APP_SIZE;
                return;
            } else {
                this.app_size = l;
                return;
            }
        }
        this.ad_id = builder.ad_id;
        this.ad_name = builder.ad_name;
        this.apk_url = builder.apk_url;
        this.ad_apk_package_name = builder.ad_apk_package_name;
        this.app_size = builder.app_size;
    }
}
