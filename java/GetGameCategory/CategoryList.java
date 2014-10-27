package tbclient.GetGameCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class CategoryList extends Message {
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<GameList> game_list;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    public static final Integer DEFAULT_ID = 0;
    public static final List<GameList> DEFAULT_GAME_LIST = Collections.emptyList();

    /* synthetic */ CategoryList(Builder builder, boolean z, CategoryList categoryList) {
        this(builder, z);
    }

    private CategoryList(Builder builder, boolean z) {
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

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<CategoryList> {
        public List<GameList> game_list;
        public String icon_url;
        public Integer id;
        public String name;

        public Builder(CategoryList categoryList) {
            super(categoryList);
            if (categoryList != null) {
                this.id = categoryList.id;
                this.name = categoryList.name;
                this.icon_url = categoryList.icon_url;
                this.game_list = CategoryList.copyOf(categoryList.game_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CategoryList build(boolean z) {
            return new CategoryList(this, z, null);
        }
    }
}
