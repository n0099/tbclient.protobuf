package tbclient.GameIndex;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes.dex */
public final class GameIndexResIdl extends Message {
    @ProtoField(tag = 2)
    public final ResData data;
    @ProtoField(tag = 1)
    public final Error error;

    /* synthetic */ GameIndexResIdl(Builder builder, boolean z, GameIndexResIdl gameIndexResIdl) {
        this(builder, z);
    }

    private GameIndexResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GameIndexResIdl> {
        public ResData data;
        public Error error;

        public Builder(GameIndexResIdl gameIndexResIdl) {
            super(gameIndexResIdl);
            if (gameIndexResIdl != null) {
                this.error = gameIndexResIdl.error;
                this.data = gameIndexResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameIndexResIdl build(boolean z) {
            return new GameIndexResIdl(this, z, null);
        }
    }
}
