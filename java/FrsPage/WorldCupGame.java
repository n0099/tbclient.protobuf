package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes22.dex */
public final class WorldCupGame extends Message {
    public static final String DEFAULT_STATUS = "";
    public static final List<WorldCupGameTeam> DEFAULT_TEAM = Collections.emptyList();
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String status;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<WorldCupGameTeam> team;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    private WorldCupGame(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.status == null) {
                this.status = "";
            } else {
                this.status = builder.status;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.team == null) {
                this.team = DEFAULT_TEAM;
                return;
            } else {
                this.team = immutableCopyOf(builder.team);
                return;
            }
        }
        this.title = builder.title;
        this.status = builder.status;
        this.url = builder.url;
        this.team = immutableCopyOf(builder.team);
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<WorldCupGame> {
        public String status;
        public List<WorldCupGameTeam> team;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(WorldCupGame worldCupGame) {
            super(worldCupGame);
            if (worldCupGame != null) {
                this.title = worldCupGame.title;
                this.status = worldCupGame.status;
                this.url = worldCupGame.url;
                this.team = WorldCupGame.copyOf(worldCupGame.team);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupGame build(boolean z) {
            return new WorldCupGame(this, z);
        }
    }
}
