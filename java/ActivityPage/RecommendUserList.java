package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes9.dex */
public final class RecommendUserList extends Message {
    public static final Integer DEFAULT_FLOOR_POSITION = 0;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer floor_position;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> user_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<RecommendUserList> {
        public Integer floor_position;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(RecommendUserList recommendUserList) {
            super(recommendUserList);
            if (recommendUserList == null) {
                return;
            }
            this.floor_position = recommendUserList.floor_position;
            this.user_list = Message.copyOf(recommendUserList.user_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendUserList build(boolean z) {
            return new RecommendUserList(this, z);
        }
    }

    public RecommendUserList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.floor_position;
            if (num == null) {
                this.floor_position = DEFAULT_FLOOR_POSITION;
            } else {
                this.floor_position = num;
            }
            List<User> list = builder.user_list;
            if (list == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.floor_position = builder.floor_position;
        this.user_list = Message.immutableCopyOf(builder.user_list);
    }
}
