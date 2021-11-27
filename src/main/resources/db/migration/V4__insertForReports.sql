INSERT INTO priority(id, name, description) VALUES
    (1, 'super_important', 'super important for app'),
    (2, 'important', 'important for app'),
    (3, 'normal', 'not very important for app');

INSERT INTO urgency(id, name, description) VALUES
    (1, 'blocker', 'crash'),
    (2, 'high', 'very important'),
    (3, 'normal', 'normal issue');

-- INSERT INTO report(id, developer_id, bug_id, priority_name, urgency_name) VALUES
--     (1, 54, 1, 'super_important', 'blocker');