package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class AddTaskScoresReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AddTaskScoresReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(AddTaskScoresReqIdl addTaskScoresReqIdl) {
            super(addTaskScoresReqIdl);
            if (addTaskScoresReqIdl == null) {
                return;
            }
            this.data = addTaskScoresReqIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddTaskScoresReqIdl build(boolean z) {
            return new AddTaskScoresReqIdl(this, z);
        }
    }

    public AddTaskScoresReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}