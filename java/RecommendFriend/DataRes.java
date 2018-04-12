package tbclient.RecommendFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    public static final List<LikeUserInfo> DEFAULT_LIKE_USER = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<LikeUserInfo> like_user;
    @ProtoField(tag = 1)
    public final UserInfo new_user;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.new_user = builder.new_user;
            if (builder.like_user == null) {
                this.like_user = DEFAULT_LIKE_USER;
                return;
            } else {
                this.like_user = immutableCopyOf(builder.like_user);
                return;
            }
        }
        this.new_user = builder.new_user;
        this.like_user = immutableCopyOf(builder.like_user);
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<LikeUserInfo> like_user;
        public UserInfo new_user;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.new_user = dataRes.new_user;
                this.like_user = DataRes.copyOf(dataRes.like_user);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}