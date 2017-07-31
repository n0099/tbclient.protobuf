package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class WorldCupGameTeam extends Message {
    public static final String DEFAULT_LOGO_URL = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String logo_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    private WorldCupGameTeam(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.logo_url == null) {
                this.logo_url = "";
                return;
            } else {
                this.logo_url = builder.logo_url;
                return;
            }
        }
        this.name = builder.name;
        this.logo_url = builder.logo_url;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<WorldCupGameTeam> {
        public String logo_url;
        public String name;

        public Builder() {
        }

        public Builder(WorldCupGameTeam worldCupGameTeam) {
            super(worldCupGameTeam);
            if (worldCupGameTeam != null) {
                this.name = worldCupGameTeam.name;
                this.logo_url = worldCupGameTeam.logo_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupGameTeam build(boolean z) {
            return new WorldCupGameTeam(this, z);
        }
    }
}
