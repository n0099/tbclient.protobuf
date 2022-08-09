package tbclient.GetHistoryForum;

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
import tbclient.FrsTabInfo;
import tbclient.HistoryForumInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<HistoryForumInfo> DEFAULT_HISTORY_FORUM;
    public static final List<FrsTabInfo> DEFAULT_NAV_TAB_INFO;
    public static final List<HistoryForumInfo> DEFAULT_THIS_WEEK_FORUMS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<HistoryForumInfo> history_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FrsTabInfo> nav_tab_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<HistoryForumInfo> this_week_forums;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<HistoryForumInfo> history_forum;
        public List<FrsTabInfo> nav_tab_info;
        public List<HistoryForumInfo> this_week_forums;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
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
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (dataRes == null) {
                return;
            }
            this.history_forum = Message.copyOf(dataRes.history_forum);
            this.nav_tab_info = Message.copyOf(dataRes.nav_tab_info);
            this.this_week_forums = Message.copyOf(dataRes.this_week_forums);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1270107493, "Ltbclient/GetHistoryForum/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1270107493, "Ltbclient/GetHistoryForum/DataRes;");
                return;
            }
        }
        DEFAULT_HISTORY_FORUM = Collections.emptyList();
        DEFAULT_NAV_TAB_INFO = Collections.emptyList();
        DEFAULT_THIS_WEEK_FORUMS = Collections.emptyList();
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
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            List<HistoryForumInfo> list = builder.history_forum;
            if (list == null) {
                this.history_forum = DEFAULT_HISTORY_FORUM;
            } else {
                this.history_forum = Message.immutableCopyOf(list);
            }
            List<FrsTabInfo> list2 = builder.nav_tab_info;
            if (list2 == null) {
                this.nav_tab_info = DEFAULT_NAV_TAB_INFO;
            } else {
                this.nav_tab_info = Message.immutableCopyOf(list2);
            }
            List<HistoryForumInfo> list3 = builder.this_week_forums;
            if (list3 == null) {
                this.this_week_forums = DEFAULT_THIS_WEEK_FORUMS;
                return;
            } else {
                this.this_week_forums = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.history_forum = Message.immutableCopyOf(builder.history_forum);
        this.nav_tab_info = Message.immutableCopyOf(builder.nav_tab_info);
        this.this_week_forums = Message.immutableCopyOf(builder.this_week_forums);
    }
}
