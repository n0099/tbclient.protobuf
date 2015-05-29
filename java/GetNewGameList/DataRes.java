package tbclient.GetNewGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 1)
    public final RunningGame running;
    @ProtoField(tag = 2)
    public final TestingGame testing;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.running = builder.running;
            this.testing = builder.testing;
            return;
        }
        this.running = builder.running;
        this.testing = builder.testing;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public RunningGame running;
        public TestingGame testing;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.running = dataRes.running;
                this.testing = dataRes.testing;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
