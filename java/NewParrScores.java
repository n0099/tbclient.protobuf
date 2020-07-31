package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class NewParrScores extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long i_total;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long scores_total;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer update_time;
    public static final Long DEFAULT_SCORES_TOTAL = 0L;
    public static final Integer DEFAULT_UPDATE_TIME = 0;
    public static final Long DEFAULT_I_TOTAL = 0L;

    private NewParrScores(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.scores_total == null) {
                this.scores_total = DEFAULT_SCORES_TOTAL;
            } else {
                this.scores_total = builder.scores_total;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.i_total == null) {
                this.i_total = DEFAULT_I_TOTAL;
                return;
            } else {
                this.i_total = builder.i_total;
                return;
            }
        }
        this.scores_total = builder.scores_total;
        this.update_time = builder.update_time;
        this.i_total = builder.i_total;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<NewParrScores> {
        public Long i_total;
        public Long scores_total;
        public Integer update_time;

        public Builder() {
        }

        public Builder(NewParrScores newParrScores) {
            super(newParrScores);
            if (newParrScores != null) {
                this.scores_total = newParrScores.scores_total;
                this.update_time = newParrScores.update_time;
                this.i_total = newParrScores.i_total;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewParrScores build(boolean z) {
            return new NewParrScores(this, z);
        }
    }
}
