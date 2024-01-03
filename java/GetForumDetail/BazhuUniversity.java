package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class BazhuUniversity extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<UniversityInfo> banner;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<UniversityInfo> entrance;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<UniversityTabInfo> tab;
    public static final List<UniversityInfo> DEFAULT_ENTRANCE = Collections.emptyList();
    public static final List<UniversityInfo> DEFAULT_BANNER = Collections.emptyList();
    public static final List<UniversityTabInfo> DEFAULT_TAB = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<BazhuUniversity> {
        public List<UniversityInfo> banner;
        public List<UniversityInfo> entrance;
        public List<UniversityTabInfo> tab;

        public Builder() {
        }

        public Builder(BazhuUniversity bazhuUniversity) {
            super(bazhuUniversity);
            if (bazhuUniversity == null) {
                return;
            }
            this.entrance = Message.copyOf(bazhuUniversity.entrance);
            this.banner = Message.copyOf(bazhuUniversity.banner);
            this.tab = Message.copyOf(bazhuUniversity.tab);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BazhuUniversity build(boolean z) {
            return new BazhuUniversity(this, z);
        }
    }

    public BazhuUniversity(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<UniversityInfo> list = builder.entrance;
            if (list == null) {
                this.entrance = DEFAULT_ENTRANCE;
            } else {
                this.entrance = Message.immutableCopyOf(list);
            }
            List<UniversityInfo> list2 = builder.banner;
            if (list2 == null) {
                this.banner = DEFAULT_BANNER;
            } else {
                this.banner = Message.immutableCopyOf(list2);
            }
            List<UniversityTabInfo> list3 = builder.tab;
            if (list3 == null) {
                this.tab = DEFAULT_TAB;
                return;
            } else {
                this.tab = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.entrance = Message.immutableCopyOf(builder.entrance);
        this.banner = Message.immutableCopyOf(builder.banner);
        this.tab = Message.immutableCopyOf(builder.tab);
    }
}
