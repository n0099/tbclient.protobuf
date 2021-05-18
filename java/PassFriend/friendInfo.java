package tbclient.PassFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class friendInfo extends Message {
    public static final String DEFAULT_KEY = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_QUANPIN = "";
    public static final Long DEFAULT_USER_ID = 0L;
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String key;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String quanpin;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<friendInfo> {
        public String key;
        public String portrait;
        public String quanpin;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(friendInfo friendinfo) {
            super(friendinfo);
            if (friendinfo == null) {
                return;
            }
            this.portrait = friendinfo.portrait;
            this.user_name = friendinfo.user_name;
            this.user_id = friendinfo.user_id;
            this.quanpin = friendinfo.quanpin;
            this.key = friendinfo.key;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public friendInfo build(boolean z) {
            return new friendInfo(this, z);
        }
    }

    public friendInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.portrait;
            if (str == null) {
                this.portrait = "";
            } else {
                this.portrait = str;
            }
            String str2 = builder.user_name;
            if (str2 == null) {
                this.user_name = "";
            } else {
                this.user_name = str2;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str3 = builder.quanpin;
            if (str3 == null) {
                this.quanpin = "";
            } else {
                this.quanpin = str3;
            }
            String str4 = builder.key;
            if (str4 == null) {
                this.key = "";
                return;
            } else {
                this.key = str4;
                return;
            }
        }
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
        this.quanpin = builder.quanpin;
        this.key = builder.key;
    }
}
