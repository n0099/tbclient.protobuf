package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final List<LikeUserInfo> DEFAULT_LIKE_USER = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<LikeUserInfo> like_user;
    @ProtoField(tag = 1)
    public final UserInfo new_user;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<LikeUserInfo> like_user;
        public UserInfo new_user;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.new_user = dataRes.new_user;
            this.like_user = Message.copyOf(dataRes.like_user);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.new_user = builder.new_user;
            List<LikeUserInfo> list = builder.like_user;
            if (list == null) {
                this.like_user = DEFAULT_LIKE_USER;
                return;
            } else {
                this.like_user = Message.immutableCopyOf(list);
                return;
            }
        }
        this.new_user = builder.new_user;
        this.like_user = Message.immutableCopyOf(builder.like_user);
    }
}
