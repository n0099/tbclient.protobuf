package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class WorldCupNews extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    private WorldCupNews(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.url == null) {
                this.url = "";
                return;
            } else {
                this.url = builder.url;
                return;
            }
        }
        this.title = builder.title;
        this.url = builder.url;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<WorldCupNews> {
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(WorldCupNews worldCupNews) {
            super(worldCupNews);
            if (worldCupNews != null) {
                this.title = worldCupNews.title;
                this.url = worldCupNews.url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupNews build(boolean z) {
            return new WorldCupNews(this, z);
        }
    }
}
