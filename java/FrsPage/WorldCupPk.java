package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class WorldCupPk extends Message {
    public static final String DEFAULT_PRIZE_URL = "";
    public static final String DEFAULT_SUM_BONUS = "";
    public static final String DEFAULT_SUM_GAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String prize_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sum_bonus;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String sum_game;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String url;

    /* synthetic */ WorldCupPk(Builder builder, boolean z, WorldCupPk worldCupPk) {
        this(builder, z);
    }

    private WorldCupPk(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.sum_game == null) {
                this.sum_game = "";
            } else {
                this.sum_game = builder.sum_game;
            }
            if (builder.sum_bonus == null) {
                this.sum_bonus = "";
            } else {
                this.sum_bonus = builder.sum_bonus;
            }
            if (builder.prize_url == null) {
                this.prize_url = "";
            } else {
                this.prize_url = builder.prize_url;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.sum_game = builder.sum_game;
        this.sum_bonus = builder.sum_bonus;
        this.prize_url = builder.prize_url;
        this.url = builder.url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<WorldCupPk> {
        public String prize_url;
        public String sum_bonus;
        public String sum_game;
        public String url;

        public Builder() {
        }

        public Builder(WorldCupPk worldCupPk) {
            super(worldCupPk);
            if (worldCupPk != null) {
                this.sum_game = worldCupPk.sum_game;
                this.sum_bonus = worldCupPk.sum_bonus;
                this.prize_url = worldCupPk.prize_url;
                this.url = worldCupPk.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupPk build(boolean z) {
            return new WorldCupPk(this, z, null);
        }
    }
}
