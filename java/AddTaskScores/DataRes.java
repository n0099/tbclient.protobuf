package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_IS_FINISH = 0;
    public static final Integer DEFAULT_SCORES = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_finish;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer scores;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.is_finish == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = builder.is_finish;
            }
            if (builder.scores == null) {
                this.scores = DEFAULT_SCORES;
                return;
            } else {
                this.scores = builder.scores;
                return;
            }
        }
        this.is_finish = builder.is_finish;
        this.scores = builder.scores;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer is_finish;
        public Integer scores;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.is_finish = dataRes.is_finish;
                this.scores = dataRes.scores;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
