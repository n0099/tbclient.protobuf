package tbclient.Personal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class UserGodInfo extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ForumGodDetailInfo> forum_god_list;
    @ProtoField(tag = 2)
    public final GodDetailInfo god_info;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer god_type;
    public static final Integer DEFAULT_GOD_TYPE = 0;
    public static final List<ForumGodDetailInfo> DEFAULT_FORUM_GOD_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserGodInfo> {
        public List<ForumGodDetailInfo> forum_god_list;
        public GodDetailInfo god_info;
        public Integer god_type;

        public Builder() {
        }

        public Builder(UserGodInfo userGodInfo) {
            super(userGodInfo);
            if (userGodInfo == null) {
                return;
            }
            this.god_type = userGodInfo.god_type;
            this.god_info = userGodInfo.god_info;
            this.forum_god_list = Message.copyOf(userGodInfo.forum_god_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserGodInfo build(boolean z) {
            return new UserGodInfo(this, z);
        }
    }

    public UserGodInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.god_type;
            if (num == null) {
                this.god_type = DEFAULT_GOD_TYPE;
            } else {
                this.god_type = num;
            }
            this.god_info = builder.god_info;
            List<ForumGodDetailInfo> list = builder.forum_god_list;
            if (list == null) {
                this.forum_god_list = DEFAULT_FORUM_GOD_LIST;
                return;
            } else {
                this.forum_god_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.god_type = builder.god_type;
        this.god_info = builder.god_info;
        this.forum_god_list = Message.immutableCopyOf(builder.forum_god_list);
    }
}
