package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class PluginUser extends Message {
    public static final String DEFAULT_USER_NAME_SHOW = "";
    public static final String DEFAULT_USER_PHOTO = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_download_card_whiteuser;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name_show;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_photo;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer user_type;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_USER_TYPE = 0;
    public static final Integer DEFAULT_IS_DOWNLOAD_CARD_WHITEUSER = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PluginUser> {
        public Integer is_download_card_whiteuser;
        public Long user_id;
        public String user_name_show;
        public String user_photo;
        public Integer user_type;

        public Builder() {
        }

        public Builder(PluginUser pluginUser) {
            super(pluginUser);
            if (pluginUser == null) {
                return;
            }
            this.user_id = pluginUser.user_id;
            this.user_name_show = pluginUser.user_name_show;
            this.user_type = pluginUser.user_type;
            this.user_photo = pluginUser.user_photo;
            this.is_download_card_whiteuser = pluginUser.is_download_card_whiteuser;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PluginUser build(boolean z) {
            return new PluginUser(this, z);
        }
    }

    public PluginUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name_show;
            if (str == null) {
                this.user_name_show = "";
            } else {
                this.user_name_show = str;
            }
            Integer num = builder.user_type;
            if (num == null) {
                this.user_type = DEFAULT_USER_TYPE;
            } else {
                this.user_type = num;
            }
            String str2 = builder.user_photo;
            if (str2 == null) {
                this.user_photo = "";
            } else {
                this.user_photo = str2;
            }
            Integer num2 = builder.is_download_card_whiteuser;
            if (num2 == null) {
                this.is_download_card_whiteuser = DEFAULT_IS_DOWNLOAD_CARD_WHITEUSER;
                return;
            } else {
                this.is_download_card_whiteuser = num2;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name_show = builder.user_name_show;
        this.user_type = builder.user_type;
        this.user_photo = builder.user_photo;
        this.is_download_card_whiteuser = builder.is_download_card_whiteuser;
    }
}
