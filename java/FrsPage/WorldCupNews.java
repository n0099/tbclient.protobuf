package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class WorldCupNews extends Message {
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<WorldCupNews> {
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(WorldCupNews worldCupNews) {
            super(worldCupNews);
            if (worldCupNews == null) {
                return;
            }
            this.title = worldCupNews.title;
            this.url = worldCupNews.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldCupNews build(boolean z) {
            return new WorldCupNews(this, z);
        }
    }

    public WorldCupNews(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.title = builder.title;
        this.url = builder.url;
    }
}
