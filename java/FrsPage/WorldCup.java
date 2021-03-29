package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class WorldCup extends Message {
    @ProtoField(tag = 4)
    public final WorldCupGame game;
    @ProtoField(tag = 3)
    public final WorldCupLottery lottery;
    @ProtoField(tag = 1)
    public final WorldCupNews news;
    @ProtoField(tag = 2)
    public final WorldCupPk pk;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<WorldCup> {
        public WorldCupGame game;
        public WorldCupLottery lottery;
        public WorldCupNews news;
        public WorldCupPk pk;

        public Builder() {
        }

        public Builder(WorldCup worldCup) {
            super(worldCup);
            if (worldCup == null) {
                return;
            }
            this.news = worldCup.news;
            this.pk = worldCup.pk;
            this.lottery = worldCup.lottery;
            this.game = worldCup.game;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCup build(boolean z) {
            return new WorldCup(this, z);
        }
    }

    public WorldCup(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.news = builder.news;
            this.pk = builder.pk;
            this.lottery = builder.lottery;
            this.game = builder.game;
            return;
        }
        this.news = builder.news;
        this.pk = builder.pk;
        this.lottery = builder.lottery;
        this.game = builder.game;
    }
}
