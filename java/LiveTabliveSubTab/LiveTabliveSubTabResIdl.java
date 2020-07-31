package tbclient.LiveTabliveSubTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes4.dex */
public final class LiveTabliveSubTabResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private LiveTabliveSubTabResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<LiveTabliveSubTabResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(LiveTabliveSubTabResIdl liveTabliveSubTabResIdl) {
            super(liveTabliveSubTabResIdl);
            if (liveTabliveSubTabResIdl != null) {
                this.error = liveTabliveSubTabResIdl.error;
                this.data = liveTabliveSubTabResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveTabliveSubTabResIdl build(boolean z) {
            return new LiveTabliveSubTabResIdl(this, z);
        }
    }
}
