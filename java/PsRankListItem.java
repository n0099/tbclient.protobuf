package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class PsRankListItem extends Message {
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long game_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long score;
    @ProtoField(tag = 4)
    public final User user;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;
    public static final Long DEFAULT_GAME_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_SCORE = 0L;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PsRankListItem> {
        public Long game_id;
        public Long score;
        public User user;
        public Long user_id;

        public Builder() {
        }

        public Builder(PsRankListItem psRankListItem) {
            super(psRankListItem);
            if (psRankListItem == null) {
                return;
            }
            this.game_id = psRankListItem.game_id;
            this.user_id = psRankListItem.user_id;
            this.score = psRankListItem.score;
            this.user = psRankListItem.user;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PsRankListItem build(boolean z) {
            return new PsRankListItem(this, z);
        }
    }

    public PsRankListItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.game_id;
            if (l == null) {
                this.game_id = DEFAULT_GAME_ID;
            } else {
                this.game_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            Long l3 = builder.score;
            if (l3 == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = l3;
            }
            this.user = builder.user;
            return;
        }
        this.game_id = builder.game_id;
        this.user_id = builder.user_id;
        this.score = builder.score;
        this.user = builder.user;
    }
}
