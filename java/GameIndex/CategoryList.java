package tbclient.GameIndex;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
/* loaded from: classes2.dex */
public final class CategoryList extends Message {
    public static final List<GameInfo> DEFAULT_CATEGORY_GAME_LIST = Collections.emptyList();
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    public static final String DEFAULT_CATEGORY_NAME = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GameInfo> category_game_list;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String category_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<CategoryList> {
        public List<GameInfo> category_game_list;
        public Integer category_id;
        public String category_name;

        public Builder() {
        }

        public Builder(CategoryList categoryList) {
            super(categoryList);
            if (categoryList == null) {
                return;
            }
            this.category_name = categoryList.category_name;
            this.category_game_list = Message.copyOf(categoryList.category_game_list);
            this.category_id = categoryList.category_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CategoryList build(boolean z) {
            return new CategoryList(this, z);
        }
    }

    public CategoryList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.category_name;
            if (str == null) {
                this.category_name = "";
            } else {
                this.category_name = str;
            }
            List<GameInfo> list = builder.category_game_list;
            if (list == null) {
                this.category_game_list = DEFAULT_CATEGORY_GAME_LIST;
            } else {
                this.category_game_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.category_id;
            if (num == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
                return;
            } else {
                this.category_id = num;
                return;
            }
        }
        this.category_name = builder.category_name;
        this.category_game_list = Message.immutableCopyOf(builder.category_game_list);
        this.category_id = builder.category_id;
    }
}
