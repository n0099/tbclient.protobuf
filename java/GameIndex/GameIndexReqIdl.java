package tbclient.GameIndex;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class GameIndexReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    /* synthetic */ GameIndexReqIdl(Builder builder, boolean z, GameIndexReqIdl gameIndexReqIdl) {
        this(builder, z);
    }

    private GameIndexReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<GameIndexReqIdl> {
        public DataReq data;

        public Builder(GameIndexReqIdl gameIndexReqIdl) {
            super(gameIndexReqIdl);
            if (gameIndexReqIdl != null) {
                this.data = gameIndexReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameIndexReqIdl build(boolean z) {
            return new GameIndexReqIdl(this, z, null);
        }
    }
}
