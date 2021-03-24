package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class User_Info extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long gender;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_GENDER = 0L;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<User_Info> {
        public Long gender;
        public Long id;
        public String name;
        public String portrait;

        public Builder() {
        }

        public Builder(User_Info user_Info) {
            super(user_Info);
            if (user_Info == null) {
                return;
            }
            this.id = user_Info.id;
            this.name = user_Info.name;
            this.portrait = user_Info.portrait;
            this.gender = user_Info.gender;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public User_Info build(boolean z) {
            return new User_Info(this, z);
        }
    }

    public User_Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Long l2 = builder.gender;
            if (l2 == null) {
                this.gender = DEFAULT_GENDER;
                return;
            } else {
                this.gender = l2;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.portrait = builder.portrait;
        this.gender = builder.gender;
    }
}
