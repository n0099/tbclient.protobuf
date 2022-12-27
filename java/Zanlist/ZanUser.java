package tbclient.Zanlist;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ZanUser extends Message {
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ZanUser> {
        public Integer create_time;
        public String portrait;
        public String user_name;

        public Builder() {
        }

        public Builder(ZanUser zanUser) {
            super(zanUser);
            if (zanUser == null) {
                return;
            }
            this.portrait = zanUser.portrait;
            this.user_name = zanUser.user_name;
            this.create_time = zanUser.create_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ZanUser build(boolean z) {
            return new ZanUser(this, z);
        }
    }

    public ZanUser(Builder builder, boolean z) {
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
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
                return;
            } else {
                this.create_time = num;
                return;
            }
        }
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
        this.create_time = builder.create_time;
    }
}
