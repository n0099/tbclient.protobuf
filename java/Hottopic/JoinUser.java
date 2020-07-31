package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes15.dex */
public final class JoinUser extends Message {
    public static final List<UserInfo> DEFAULT_JOIN_USER = Collections.emptyList();
    public static final Long DEFAULT_JOIN_USER_NUM = 0L;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<UserInfo> join_user;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long join_user_num;

    private JoinUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.join_user == null) {
                this.join_user = DEFAULT_JOIN_USER;
            } else {
                this.join_user = immutableCopyOf(builder.join_user);
            }
            if (builder.join_user_num == null) {
                this.join_user_num = DEFAULT_JOIN_USER_NUM;
                return;
            } else {
                this.join_user_num = builder.join_user_num;
                return;
            }
        }
        this.join_user = immutableCopyOf(builder.join_user);
        this.join_user_num = builder.join_user_num;
    }

    /* loaded from: classes15.dex */
    public static final class Builder extends Message.Builder<JoinUser> {
        public List<UserInfo> join_user;
        public Long join_user_num;

        public Builder() {
        }

        public Builder(JoinUser joinUser) {
            super(joinUser);
            if (joinUser != null) {
                this.join_user = JoinUser.copyOf(joinUser.join_user);
                this.join_user_num = joinUser.join_user_num;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public JoinUser build(boolean z) {
            return new JoinUser(this, z);
        }
    }
}
