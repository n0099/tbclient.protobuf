package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.User;
/* loaded from: classes22.dex */
public final class RecommendUserList extends Message {
    public static final Integer DEFAULT_FLOOR_POSITION = 0;
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer floor_position;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<User> user_list;

    private RecommendUserList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.floor_position == null) {
                this.floor_position = DEFAULT_FLOOR_POSITION;
            } else {
                this.floor_position = builder.floor_position;
            }
            if (builder.user_list == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = immutableCopyOf(builder.user_list);
                return;
            }
        }
        this.floor_position = builder.floor_position;
        this.user_list = immutableCopyOf(builder.user_list);
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<RecommendUserList> {
        public Integer floor_position;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(RecommendUserList recommendUserList) {
            super(recommendUserList);
            if (recommendUserList != null) {
                this.floor_position = recommendUserList.floor_position;
                this.user_list = RecommendUserList.copyOf(recommendUserList.user_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendUserList build(boolean z) {
            return new RecommendUserList(this, z);
        }
    }
}
