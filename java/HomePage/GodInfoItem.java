package tbclient.HomePage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GodInfoItem extends Message {
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_GOD_INTRO = "";
    public static final Long DEFAULT_UID = 0L;
    public static final String DEFAULT_USER_INTRO = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String god_intro;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String user_intro;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<GodInfoItem> {
        public String avatar;
        public String god_intro;
        public Long uid;
        public String user_intro;
        public String user_name;

        public Builder() {
        }

        public Builder(GodInfoItem godInfoItem) {
            super(godInfoItem);
            if (godInfoItem == null) {
                return;
            }
            this.uid = godInfoItem.uid;
            this.avatar = godInfoItem.avatar;
            this.user_name = godInfoItem.user_name;
            this.user_intro = godInfoItem.user_intro;
            this.god_intro = godInfoItem.god_intro;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GodInfoItem build(boolean z) {
            return new GodInfoItem(this, z);
        }
    }

    public GodInfoItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str = builder.avatar;
            if (str == null) {
                this.avatar = "";
            } else {
                this.avatar = str;
            }
            String str2 = builder.user_name;
            if (str2 == null) {
                this.user_name = "";
            } else {
                this.user_name = str2;
            }
            String str3 = builder.user_intro;
            if (str3 == null) {
                this.user_intro = "";
            } else {
                this.user_intro = str3;
            }
            String str4 = builder.god_intro;
            if (str4 == null) {
                this.god_intro = "";
                return;
            } else {
                this.god_intro = str4;
                return;
            }
        }
        this.uid = builder.uid;
        this.avatar = builder.avatar;
        this.user_name = builder.user_name;
        this.user_intro = builder.user_intro;
        this.god_intro = builder.god_intro;
    }
}
