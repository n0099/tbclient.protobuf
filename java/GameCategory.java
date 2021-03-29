package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<GameCategory> {
        public List<String> game_list;
        public String icon_url;
        public Integer id;
        public String name;

        public Builder() {
        }

        public Builder(GameCategory gameCategory) {
            super(gameCategory);
            if (gameCategory == null) {
                return;
            }
            this.id = gameCategory.id;
            this.name = gameCategory.name;
            this.icon_url = gameCategory.icon_url;
            this.game_list = Message.copyOf(gameCategory.game_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameCategory build(boolean z) {
            return new GameCategory(this, z);
        }
    }

    public GameCategory(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon_url;
            if (str2 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str2;
            }
            List<String> list = builder.game_list;
            if (list == null) {
                this.game_list = DEFAULT_GAME_LIST;
                return;
            } else {
                this.game_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.id = builder.id;
        this.name = builder.name;
        this.icon_url = builder.icon_url;
        this.game_list = Message.immutableCopyOf(builder.game_list);
    }
}
