package tbclient.GetForumDetail;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BawuThrones;
import tbclient.ManagerApplyInfo;
import tbclient.PriManagerApplyInfo;
import tbclient.RecommendForumInfo;
import tbclient.SimpleThreadInfo;
/* loaded from: classes5.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<BawuAction> DEFAULT_BAWU_ACTIONS;
    public static final Integer DEFAULT_IS_BAWU_SHOW;
    public static final String DEFAULT_IS_BAZHU_SHOW = "";
    public static final Integer DEFAULT_IS_COMPLAINT_SHOW;
    public static final Integer DEFAULT_IS_FORUM_CARD_ENABLE;
    public static final Integer DEFAULT_IS_FORUM_DATA_SHOW;
    public static final List<SimpleThreadInfo> DEFAULT_THREAD_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 12)
    public final ApplyStatus apply_status;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<BawuAction> bawu_actions;
    @ProtoField(tag = 17)
    public final BawuThrones bawu_thrones;
    @ProtoField(tag = 15)
    public final BazhuGrade bazhu_grade;
    @ProtoField(tag = 13)
    public final BazhuUniversity bazhu_university;
    @ProtoField(tag = 5)
    public final ManagerApplyInfo bz_apply_info;
    @ProtoField(tag = 8)
    public final ManagerElectionTab election_tab;
    @ProtoField(tag = 10)
    public final ForumDataCenter forum_data;
    @ProtoField(tag = 1)
    public final RecommendForumInfo forum_info;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_bawu_show;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String is_bazhu_show;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer is_complaint_show;
    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer is_forum_card_enable;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer is_forum_data_show;
    @ProtoField(tag = 7)
    public final PriManagerApplyInfo pribz_apply_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<SimpleThreadInfo> thread_list;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public ApplyStatus apply_status;
        public List<BawuAction> bawu_actions;
        public BawuThrones bawu_thrones;
        public BazhuGrade bazhu_grade;
        public BazhuUniversity bazhu_university;
        public ManagerApplyInfo bz_apply_info;
        public ManagerElectionTab election_tab;
        public ForumDataCenter forum_data;
        public RecommendForumInfo forum_info;
        public Integer is_bawu_show;
        public String is_bazhu_show;
        public Integer is_complaint_show;
        public Integer is_forum_card_enable;
        public Integer is_forum_data_show;
        public PriManagerApplyInfo pribz_apply_info;
        public List<SimpleThreadInfo> thread_list;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (dataRes == null) {
                return;
            }
            this.forum_info = dataRes.forum_info;
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.is_bawu_show = dataRes.is_bawu_show;
            this.bz_apply_info = dataRes.bz_apply_info;
            this.is_complaint_show = dataRes.is_complaint_show;
            this.pribz_apply_info = dataRes.pribz_apply_info;
            this.election_tab = dataRes.election_tab;
            this.is_forum_data_show = dataRes.is_forum_data_show;
            this.forum_data = dataRes.forum_data;
            this.bawu_actions = Message.copyOf(dataRes.bawu_actions);
            this.apply_status = dataRes.apply_status;
            this.bazhu_university = dataRes.bazhu_university;
            this.bazhu_grade = dataRes.bazhu_grade;
            this.is_forum_card_enable = dataRes.is_forum_card_enable;
            this.bawu_thrones = dataRes.bawu_thrones;
            this.is_bazhu_show = dataRes.is_bazhu_show;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(750498670, "Ltbclient/GetForumDetail/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(750498670, "Ltbclient/GetForumDetail/DataRes;");
                return;
            }
        }
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_IS_BAWU_SHOW = 0;
        DEFAULT_IS_COMPLAINT_SHOW = 0;
        DEFAULT_IS_FORUM_DATA_SHOW = 0;
        DEFAULT_BAWU_ACTIONS = Collections.emptyList();
        DEFAULT_IS_FORUM_CARD_ENABLE = 0;
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            this.forum_info = builder.forum_info;
            List<SimpleThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.is_bawu_show;
            if (num == null) {
                this.is_bawu_show = DEFAULT_IS_BAWU_SHOW;
            } else {
                this.is_bawu_show = num;
            }
            this.bz_apply_info = builder.bz_apply_info;
            Integer num2 = builder.is_complaint_show;
            if (num2 == null) {
                this.is_complaint_show = DEFAULT_IS_COMPLAINT_SHOW;
            } else {
                this.is_complaint_show = num2;
            }
            this.pribz_apply_info = builder.pribz_apply_info;
            this.election_tab = builder.election_tab;
            Integer num3 = builder.is_forum_data_show;
            if (num3 == null) {
                this.is_forum_data_show = DEFAULT_IS_FORUM_DATA_SHOW;
            } else {
                this.is_forum_data_show = num3;
            }
            this.forum_data = builder.forum_data;
            List<BawuAction> list2 = builder.bawu_actions;
            if (list2 == null) {
                this.bawu_actions = DEFAULT_BAWU_ACTIONS;
            } else {
                this.bawu_actions = Message.immutableCopyOf(list2);
            }
            this.apply_status = builder.apply_status;
            this.bazhu_university = builder.bazhu_university;
            this.bazhu_grade = builder.bazhu_grade;
            Integer num4 = builder.is_forum_card_enable;
            if (num4 == null) {
                this.is_forum_card_enable = DEFAULT_IS_FORUM_CARD_ENABLE;
            } else {
                this.is_forum_card_enable = num4;
            }
            this.bawu_thrones = builder.bawu_thrones;
            String str = builder.is_bazhu_show;
            if (str == null) {
                this.is_bazhu_show = "";
                return;
            } else {
                this.is_bazhu_show = str;
                return;
            }
        }
        this.forum_info = builder.forum_info;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.is_bawu_show = builder.is_bawu_show;
        this.bz_apply_info = builder.bz_apply_info;
        this.is_complaint_show = builder.is_complaint_show;
        this.pribz_apply_info = builder.pribz_apply_info;
        this.election_tab = builder.election_tab;
        this.is_forum_data_show = builder.is_forum_data_show;
        this.forum_data = builder.forum_data;
        this.bawu_actions = Message.immutableCopyOf(builder.bawu_actions);
        this.apply_status = builder.apply_status;
        this.bazhu_university = builder.bazhu_university;
        this.bazhu_grade = builder.bazhu_grade;
        this.is_forum_card_enable = builder.is_forum_card_enable;
        this.bawu_thrones = builder.bawu_thrones;
        this.is_bazhu_show = builder.is_bazhu_show;
    }
}
