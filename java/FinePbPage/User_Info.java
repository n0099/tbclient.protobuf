package tbclient.FinePbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class User_Info extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long gender;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    public static final Long DEFAULT_ID = 0L;
    public static final Long DEFAULT_GENDER = 0L;

    /* synthetic */ User_Info(Builder builder, boolean z, User_Info user_Info) {
        this(builder, z);
    }

    private User_Info(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.gender == null) {
                this.gender = DEFAULT_GENDER;
                return;
            } else {
                this.gender = builder.gender;
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.portrait = builder.portrait;
        this.gender = builder.gender;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<User_Info> {
        public Long gender;
        public Long id;
        public String name;
        public String portrait;

        public Builder(User_Info user_Info) {
            super(user_Info);
            if (user_Info != null) {
                this.id = user_Info.id;
                this.name = user_Info.name;
                this.portrait = user_Info.portrait;
                this.gender = user_Info.gender;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public User_Info build(boolean z) {
            return new User_Info(this, z, null);
        }
    }
}
