package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class WorldCupLottery extends Message {
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<WorldCupLottery> {
        public String url;

        public Builder() {
        }

        public Builder(WorldCupLottery worldCupLottery) {
            super(worldCupLottery);
            if (worldCupLottery == null) {
                return;
            }
            this.url = worldCupLottery.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupLottery build(boolean z) {
            return new WorldCupLottery(this, z);
        }
    }

    public WorldCupLottery(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
                return;
            } else {
                this.url = str;
                return;
            }
        }
        this.url = builder.url;
    }
}
