package tbclient.AddTaskScores;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes8.dex */
public final class AddTaskScoresResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AddTaskScoresResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AddTaskScoresResIdl addTaskScoresResIdl) {
            super(addTaskScoresResIdl);
            if (addTaskScoresResIdl == null) {
                return;
            }
            this.error = addTaskScoresResIdl.error;
            this.data = addTaskScoresResIdl.data;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AddTaskScoresResIdl build(boolean z) {
            return new AddTaskScoresResIdl(this, z);
        }
    }

    public AddTaskScoresResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }
}
