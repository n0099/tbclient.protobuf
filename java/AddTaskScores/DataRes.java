package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_IS_FINISH = 0;
    public static final Integer DEFAULT_SCORES = 0;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_finish;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer scores;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer is_finish;
        public Integer scores;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.is_finish = dataRes.is_finish;
            this.scores = dataRes.scores;
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
            Integer num = builder.is_finish;
            if (num == null) {
                this.is_finish = DEFAULT_IS_FINISH;
            } else {
                this.is_finish = num;
            }
            Integer num2 = builder.scores;
            if (num2 == null) {
                this.scores = DEFAULT_SCORES;
                return;
            } else {
                this.scores = num2;
                return;
            }
        }
        this.is_finish = builder.is_finish;
        this.scores = builder.scores;
    }
}
