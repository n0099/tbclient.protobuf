package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class GameCategory extends Message {
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> game_list;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    public static final Integer DEFAULT_ID = 0;
    public static final List<String> DEFAULT_GAME_LIST = Collections.emptyList();

    private GameCategory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.icon_url == null) {
                this.icon_url = "";
            } else {
                this.icon_url = builder.icon_url;
            }
            if (builder.game_list == null) {
                this.game_list = DEFAULT_GAME_LIST;
                return;
            } else {
                this.game_list = immutableCopyOf(builder.game_list);
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.icon_url = builder.icon_url;
        this.game_list = immutableCopyOf(builder.game_list);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<GameCategory> {
        public List<String> game_list;
        public String icon_url;
        public Integer id;
        public String name;

        public Builder() {
        }

        public Builder(GameCategory gameCategory) {
            super(gameCategory);
            if (gameCategory != null) {
                this.id = gameCategory.id;
                this.name = gameCategory.name;
                this.icon_url = gameCategory.icon_url;
                this.game_list = GameCategory.copyOf(gameCategory.game_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameCategory build(boolean z) {
            return new GameCategory(this, z);
        }
    }
}
