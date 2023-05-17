package tbclient.SaveGameStatus;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class UserGameStatus extends Message {
    public static final String DEFAULT_GAME_ID = "";
    public static final Integer DEFAULT_STATUS = 0;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer status;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<UserGameStatus> {
        public String game_id;
        public Integer status;

        public Builder() {
        }

        public Builder(UserGameStatus userGameStatus) {
            super(userGameStatus);
            if (userGameStatus == null) {
                return;
            }
            this.game_id = userGameStatus.game_id;
            this.status = userGameStatus.status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserGameStatus build(boolean z) {
            return new UserGameStatus(this, z);
        }
    }

    public UserGameStatus(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.game_id;
            if (str == null) {
                this.game_id = "";
            } else {
                this.game_id = str;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
                return;
            } else {
                this.status = num;
                return;
            }
        }
        this.game_id = builder.game_id;
        this.status = builder.status;
    }
}
