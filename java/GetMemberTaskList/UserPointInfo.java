package tbclient.GetMemberTaskList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class UserPointInfo extends Message {
    public static final Long DEFAULT_POINTS_TOTAL = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long points_total;

    private UserPointInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.points_total == null) {
                this.points_total = DEFAULT_POINTS_TOTAL;
                return;
            } else {
                this.points_total = builder.points_total;
                return;
            }
        }
        this.points_total = builder.points_total;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserPointInfo> {
        public Long points_total;

        public Builder() {
        }

        public Builder(UserPointInfo userPointInfo) {
            super(userPointInfo);
            if (userPointInfo != null) {
                this.points_total = userPointInfo.points_total;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserPointInfo build(boolean z) {
            return new UserPointInfo(this, z);
        }
    }
}
