package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes9.dex */
public final class MemberGodInfo extends Message {
    public static final List<User> DEFAULT_FORUM_GOD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_FORUM_GOD_NUM = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<User> forum_god_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer forum_god_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MemberGodInfo> {
        public List<User> forum_god_list;
        public Integer forum_god_num;

        public Builder() {
        }

        public Builder(MemberGodInfo memberGodInfo) {
            super(memberGodInfo);
            if (memberGodInfo == null) {
                return;
            }
            this.forum_god_list = Message.copyOf(memberGodInfo.forum_god_list);
            this.forum_god_num = memberGodInfo.forum_god_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MemberGodInfo build(boolean z) {
            return new MemberGodInfo(this, z);
        }
    }

    public MemberGodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<User> list = builder.forum_god_list;
            if (list == null) {
                this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
            } else {
                this.forum_god_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.forum_god_num;
            if (num == null) {
                this.forum_god_num = DEFAULT_FORUM_GOD_NUM;
                return;
            } else {
                this.forum_god_num = num;
                return;
            }
        }
        this.forum_god_list = Message.immutableCopyOf(builder.forum_god_list);
        this.forum_god_num = builder.forum_god_num;
    }
}
