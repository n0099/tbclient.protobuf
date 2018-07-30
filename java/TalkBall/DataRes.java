package tbclient.TalkBall;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerImage;
import tbclient.RedpacketRain;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 5)
    public final AdidasAdvert adidas_advert;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<BannerImage> banner_images;
    @ProtoField(tag = 6)
    public final GuessingCompetition guessing_competition;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long last_thread_id;
    @ProtoField(tag = 7)
    public final RedpacketRain redpacketrain;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<CardInfo> thread_list;
    public static final List<CardInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final List<BannerImage> DEFAULT_BANNER_IMAGES = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Long DEFAULT_LAST_THREAD_ID = 0L;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            if (builder.banner_images == null) {
                this.banner_images = DEFAULT_BANNER_IMAGES;
            } else {
                this.banner_images = immutableCopyOf(builder.banner_images);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.last_thread_id == null) {
                this.last_thread_id = DEFAULT_LAST_THREAD_ID;
            } else {
                this.last_thread_id = builder.last_thread_id;
            }
            this.adidas_advert = builder.adidas_advert;
            this.guessing_competition = builder.guessing_competition;
            this.redpacketrain = builder.redpacketrain;
            return;
        }
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.banner_images = immutableCopyOf(builder.banner_images);
        this.has_more = builder.has_more;
        this.last_thread_id = builder.last_thread_id;
        this.adidas_advert = builder.adidas_advert;
        this.guessing_competition = builder.guessing_competition;
        this.redpacketrain = builder.redpacketrain;
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public AdidasAdvert adidas_advert;
        public List<BannerImage> banner_images;
        public GuessingCompetition guessing_competition;
        public Integer has_more;
        public Long last_thread_id;
        public RedpacketRain redpacketrain;
        public List<CardInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.thread_list = DataRes.copyOf(dataRes.thread_list);
                this.banner_images = DataRes.copyOf(dataRes.banner_images);
                this.has_more = dataRes.has_more;
                this.last_thread_id = dataRes.last_thread_id;
                this.adidas_advert = dataRes.adidas_advert;
                this.guessing_competition = dataRes.guessing_competition;
                this.redpacketrain = dataRes.redpacketrain;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
