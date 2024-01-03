package tbclient.GetUpdateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThemeSkinUpdateInfo extends Message {
    public static final String DEFAULT_PACKAGE_URL = "";
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_PROPS_VERSION = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String package_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer props_version;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThemeSkinUpdateInfo> {
        public String package_url;
        public Integer props_id;
        public Integer props_version;

        public Builder() {
        }

        public Builder(ThemeSkinUpdateInfo themeSkinUpdateInfo) {
            super(themeSkinUpdateInfo);
            if (themeSkinUpdateInfo == null) {
                return;
            }
            this.props_id = themeSkinUpdateInfo.props_id;
            this.props_version = themeSkinUpdateInfo.props_version;
            this.package_url = themeSkinUpdateInfo.package_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeSkinUpdateInfo build(boolean z) {
            return new ThemeSkinUpdateInfo(this, z);
        }
    }

    public ThemeSkinUpdateInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            Integer num2 = builder.props_version;
            if (num2 == null) {
                this.props_version = DEFAULT_PROPS_VERSION;
            } else {
                this.props_version = num2;
            }
            String str = builder.package_url;
            if (str == null) {
                this.package_url = "";
                return;
            } else {
                this.package_url = str;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.props_version = builder.props_version;
        this.package_url = builder.package_url;
    }
}
