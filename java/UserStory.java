package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class UserStory extends Message {
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer has_read;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_HAS_READ = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<UserStory> {
        public Integer has_read;
        public String portrait;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(UserStory userStory) {
            super(userStory);
            if (userStory == null) {
                return;
            }
            this.user_id = userStory.user_id;
            this.user_name = userStory.user_name;
            this.portrait = userStory.portrait;
            this.has_read = userStory.has_read;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserStory build(boolean z) {
            return new UserStory(this, z);
        }
    }

    public UserStory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num = builder.has_read;
            if (num == null) {
                this.has_read = DEFAULT_HAS_READ;
                return;
            } else {
                this.has_read = num;
                return;
            }
        }
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.has_read = builder.has_read;
    }
}
