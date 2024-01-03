package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThemeBackgroundInUser extends Message {
    public static final String DEFAULT_DYNAMIC = "";
    public static final String DEFAULT_EXCLUSIVE_NO = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final Long DEFAULT_PROPS_ID = 0L;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String dynamic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String exclusive_no;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long props_id;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThemeBackgroundInUser> {
        public String dynamic;
        public String exclusive_no;
        public String jump_url;
        public String package_name;
        public Long props_id;

        public Builder() {
        }

        public Builder(ThemeBackgroundInUser themeBackgroundInUser) {
            super(themeBackgroundInUser);
            if (themeBackgroundInUser == null) {
                return;
            }
            this.props_id = themeBackgroundInUser.props_id;
            this.exclusive_no = themeBackgroundInUser.exclusive_no;
            this.jump_url = themeBackgroundInUser.jump_url;
            this.dynamic = themeBackgroundInUser.dynamic;
            this.package_name = themeBackgroundInUser.package_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeBackgroundInUser build(boolean z) {
            return new ThemeBackgroundInUser(this, z);
        }
    }

    public ThemeBackgroundInUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = l;
            }
            String str = builder.exclusive_no;
            if (str == null) {
                this.exclusive_no = "";
            } else {
                this.exclusive_no = str;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            String str3 = builder.dynamic;
            if (str3 == null) {
                this.dynamic = "";
            } else {
                this.dynamic = str3;
            }
            String str4 = builder.package_name;
            if (str4 == null) {
                this.package_name = "";
                return;
            } else {
                this.package_name = str4;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.exclusive_no = builder.exclusive_no;
        this.jump_url = builder.jump_url;
        this.dynamic = builder.dynamic;
        this.package_name = builder.package_name;
    }
}
