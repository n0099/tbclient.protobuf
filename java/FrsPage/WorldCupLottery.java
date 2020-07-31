package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class WorldCupLottery extends Message {
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    private WorldCupLottery(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.url = builder.url;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<WorldCupLottery> {
        public String url;

        public Builder() {
        }

        public Builder(WorldCupLottery worldCupLottery) {
            super(worldCupLottery);
            if (worldCupLottery != null) {
                this.url = worldCupLottery.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupLottery build(boolean z) {
            return new WorldCupLottery(this, z);
        }
    }
}
